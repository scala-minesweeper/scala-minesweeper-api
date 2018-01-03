package de.htwg.mps.minesweeper.api.events

import de.htwg.mps.minesweeper.api.{Field, Game, Grid, Player}

trait GameEvent

case class FieldUpdate(row: Int, col: Int, field: FieldModel, grid: GridModel) extends GameEvent

object FieldUpdate {
  def apply(row: Int, col: Int, field: Field, grid: Grid): FieldUpdate = new FieldUpdate(row, col, FieldModel(field), GridModel(grid))
}

case class GridUpdate(grid: GridModel) extends GameEvent

object GridUpdate {
  def apply(grid: Grid): GridUpdate = new GridUpdate(GridModel(grid))
}

case class GameUpdate(game: GameModel) extends GameEvent

object GameUpdate {
  def apply(game: Game): GameUpdate = new GameUpdate(GameModel(game))
}

case class GameWon(game: GameModel) extends GameEvent

object GameWon {
  def apply(game: Game): GameWon = new GameWon(GameModel(game))
}

case class GameLost(game: GameModel) extends GameEvent

object GameLost {
  def apply(game: Game): GameLost = new GameLost(GameModel(game))
}

case class GameStart(game: GameModel) extends GameEvent

object GameStart {
  def apply(game: Game): GameStart = new GameStart(GameModel(game))
}

case class PlayerUpdate(player: PlayerModel) extends GameEvent

object PlayerUpdate {
  def apply(player: Player): PlayerUpdate = new PlayerUpdate(PlayerModel(player))
}