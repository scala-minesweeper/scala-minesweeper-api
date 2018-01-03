package de.htwg.mps.minesweeper.api.events

import de.htwg.mps.minesweeper.api.GameResult

case class GameResultModel(win: Boolean, score: Int)

object GameResultModel {
  def apply(gameResult: GameResult): GameResultModel =
    new GameResultModel(gameResult.win, gameResult.getScore)
}