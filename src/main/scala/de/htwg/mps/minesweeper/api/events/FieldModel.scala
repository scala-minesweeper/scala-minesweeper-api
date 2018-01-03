package de.htwg.mps.minesweeper.api.events

import de.htwg.mps.minesweeper.api.{Field, FieldState}

case class FieldModel(fieldState: FieldState, value: String)

object FieldModel {
  def apply(field: Field): FieldModel = new FieldModel(field.fieldState, field.toString)
}