package de.htwg.mps.minesweeper.api.events

import de.htwg.mps.minesweeper.api.{Field, Game, Grid, Player}

trait GameEvent

case class FieldUpdate(row: Int, col: Int, field: Field, grid: Grid) extends GameEvent

case class GridUpdate(grid: Grid) extends GameEvent

case class GameUpdate(game: Game) extends GameEvent

case class GameWon(game: Game) extends GameEvent

case class GameLost(game: Game) extends GameEvent

case class GameStart(game: Game) extends GameEvent

case class PlayerUpdate(player: Player) extends GameEvent