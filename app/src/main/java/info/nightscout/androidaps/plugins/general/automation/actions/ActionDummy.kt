package info.nightscout.androidaps.plugins.general.automation.actions

import info.nightscout.androidaps.MainApp
import info.nightscout.androidaps.queue.Callback

// Used for instantiation of other actions only
class ActionDummy(mainApp: MainApp) : Action(mainApp) {

    override fun friendlyName(): Int {
        throw NotImplementedError("An operation is not implemented")
    }

    override fun shortDescription(): String {
        throw NotImplementedError("An operation is not implemented")
    }

    override fun doAction(callback: Callback) {
        throw NotImplementedError("An operation is not implemented")
    }

    override fun icon(): Int {
        throw NotImplementedError("An operation is not implemented")
    }
}