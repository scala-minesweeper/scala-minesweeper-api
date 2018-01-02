package de.htwg.mps.minesweeper.api

trait Game {
  def startGame(): Game

  def finishGame(): Game

  def updateGrid(grid: Grid): Game

  def grid(): Grid

  def isRunning: Boolean

  def isFinished: Boolean

  def getScore: Option[GameResult]

  def checkWin: Boolean

  def checkLost: Boolean
}