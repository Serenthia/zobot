package com.zobot.client.packet.definitions.clientbound.play

import com.zobot.client.packet.Packet

case class UnlockRecipes(count: Int, entityIds: Any) extends Packet {
  override lazy val packetId = 0x32

  override lazy val packetData: Array[Byte] =
    fromVarInt(count) ++
    fromAny(entityIds)
}
