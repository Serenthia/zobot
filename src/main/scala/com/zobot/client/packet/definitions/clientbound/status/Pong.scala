package com.zobot.client.packet.definitions.clientbound.status

import com.zobot.client.packet.Packet

case class Pong(payload: Any) extends Packet {
  override lazy val packetId = 0x01

  override lazy val packetData: Array[Byte] =
    fromAny(payload)
}
