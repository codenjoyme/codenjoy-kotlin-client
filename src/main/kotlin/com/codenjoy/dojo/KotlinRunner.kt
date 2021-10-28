package com.codenjoy.dojo

import com.codenjoy.dojo.client.WebSocketRunner
import com.codenjoy.dojo.client.runner.ReflectLoader.loadKotlinBoard
import com.codenjoy.dojo.client.runner.ReflectLoader.loadKotlinSolver

object KotlinRunner {

  // Select your game
  var GAME = "mollymage"

  // Paste here board page url from browser after registration,
  // or put it as command line parameter.
  var URL = "http://127.0.0.1:8080/codenjoy-contest/board/player/0?code=000000000000"

  @JvmStatic
  fun main(args: Array<String>) {
    if (args != null && args.size == 2) {
      GAME = args[0]
      URL = args[1]
    }
    WebSocketRunner.runClient(URL, loadKotlinSolver(GAME), loadKotlinBoard(GAME))
  }
}