package org.example.plugin

import dev.waterdog.waterdogpe.plugin.Plugin

class Loader : Plugin() {

    override fun onStartup() {
        logger.info("I've been loaded!")
    }

    override fun onEnable() {
        logger.info("I've been enabled!")
    }

    override fun onDisable() {
        logger.info("I've been disabled!")
    }
}
