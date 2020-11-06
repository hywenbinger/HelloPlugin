package com.wayne.plugin2

import com.wayne.plugin.common.Plugin

class PluginImpl2: Plugin {
    override fun start() {
        println("Plugin2: Start")
    }

    override fun stop() {
        println("Plugin2: Stop")
    }
}
