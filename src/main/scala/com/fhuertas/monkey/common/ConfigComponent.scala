package com.fhuertas.monkey.common

import com.typesafe.config.{Config, ConfigFactory}

import scala.util.Try

trait ConfigComponent {

  val config: Config = ConfigFactory.load()

  def getString(key: String, default: String): String = getString(key) getOrElse default

  def getString(key: String): Option[String] = Try(config.getString(key)).toOption

  def getInt(key: String, default: Int): Int = getInt(key) getOrElse default

  def getInt(key: String): Option[Int] = Try(config.getInt(key)).toOption

  def getBoolean(key: String, default: Boolean): Boolean = getBoolean(key) getOrElse default

  def getBoolean(key: String): Option[Boolean] = Try(config.getBoolean(key)).toOption

}


object ConfigComponent {
  val KEY_MONKEY_ROOT = "monkey"

}