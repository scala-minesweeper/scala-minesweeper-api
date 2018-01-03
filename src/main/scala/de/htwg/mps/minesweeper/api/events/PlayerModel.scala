package de.htwg.mps.minesweeper.api.events

import de.htwg.mps.minesweeper.api.{GameResult, Player}

case class PlayerModel(history: List[GameResult])

object PlayerModel {
  def apply(player: Player): PlayerModel = new PlayerModel(player.history)
}