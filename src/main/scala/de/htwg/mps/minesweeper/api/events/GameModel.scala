package de.htwg.mps.minesweeper.api.events

import de.htwg.mps.minesweeper.api.Game

case class GameModel(finished: Boolean,
                     running: Boolean,
                     score: Option[GameResultModel],
                     grid: GridModel)

object GameModel {
  def apply(game: Game): GameModel = new GameModel(game.isFinished,
    game.isRunning, game.getScore.fold[Option[GameResultModel]](None)(g => Some(GameResultModel(g))), GridModel(game.grid()))
}
