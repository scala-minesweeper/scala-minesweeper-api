package de.htwg.mps.minesweeper.api

import org.scalatest.{Matchers, WordSpec}

class GameResultTest extends WordSpec with Matchers {

  "A winner MinesweeperGameResult for a 3x3 grid with 3 bombs in 10s" should {
    val result = GameResult(win = true, 3, 3, 10, 9)

    "have sub-scores" in {
      result.foundBombsScore shouldBe 300
      result.gridDifficultyScore shouldBe 166
      result.timeScore shouldBe 85
    }

    "have a summed score" in {
      result.score shouldBe 551
    }

  }

  "A winner easy GameResult for a 3x3 grid with 7 bombs in 10s" should {
    val result = GameResult(win = true, 7, 7, 10, 9)

    "have sub-scores" in {
      result.foundBombsScore shouldBe 700
      result.gridDifficultyScore shouldBe 388
      result.timeScore shouldBe 85
    }

    "have a summed score" in {
      result.score shouldBe 1173
    }

  }

  "A looser GameResult for a 3x3 grid with 3 bombs in 10s" should {
    val result = GameResult(win = false, 3, 3, 10, 9)

    "have sub-scores" in {
      result.foundBombsScore shouldBe 30
      result.gridDifficultyScore shouldBe 0
      result.timeScore shouldBe 0
    }

    "have a summed score" in {
      result.score shouldBe 30
    }

  }

}
