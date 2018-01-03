package de.htwg.mps.minesweeper.api.events

import de.htwg.mps.minesweeper.api.Grid

case class GridModel(bombs: Int,
                     missingBombs: Int,
                     size: (Int, Int),
                     fields: List[List[FieldModel]])

object GridModel {
  def apply(grid: Grid): GridModel =
    new GridModel(grid.bombs, grid.missingBombs, grid.getSize, grid.nestedFields.map(cols => cols.map(FieldModel(_))))
}