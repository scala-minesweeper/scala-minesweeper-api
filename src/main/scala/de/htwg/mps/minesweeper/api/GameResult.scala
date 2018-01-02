package de.htwg.mps.minesweeper.api

trait GameResult {
  def getScore: Int

  def win: Boolean
}