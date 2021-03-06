package com.zobot.client.packet.definitions.serverbound.play

import com.zobot.client.packet.Packet

case class VehicleMove(x: Any, y: Any, z: Any, yaw: Any, pitch: Any) extends Packet {
  override lazy val packetId = 0x10

  override lazy val packetData: Array[Byte] =
    fromAny(x) ++
    fromAny(y) ++
    fromAny(z) ++
    fromAny(yaw) ++
    fromAny(pitch)
}
