package com.zobot

import com.zobot.client.ZobotClient

import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Failure

object Zobot extends App {

  val client = new ZobotClient("127.0.0.1", 8001)

  client login("user", "pass") andThen {
    case Failure(e) => println(e)
  }

}
