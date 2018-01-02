package de.htwg.mps.minesweeper.api

trait Player {

  def history: List[GameResult]
  def addGameResult(gameResult: GameResult): Player

}
