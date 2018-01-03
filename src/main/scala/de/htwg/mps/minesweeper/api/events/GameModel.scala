package de.htwg.mps.minesweeper.api.events

import de.htwg.mps.minesweeper.api.{Game, GameResult}

case class GameModel(finished: Boolean,
                     running: Boolean,
                     gameResult: Option[GameResult],
                     grid: GridModel)

object GameModel {
  def apply(game: Game): GameModel = new GameModel(game.isFinished,
    game.isRunning, game.gameResult, GridModel(game.grid()))
}
