package de.htwg.mps.minesweeper.api.events

import de.htwg.mps.minesweeper.api.Player

case class PlayerModel(history: List[GameResultModel])

object PlayerModel {
  def apply(player: Player): PlayerModel = new PlayerModel(player.history.map(GameResultModel(_)))
}