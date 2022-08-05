package ch04.ex1_2_1_OpenFinalAbstractModifiers

import java.io.Serializable

interface State : Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

class Button : View {
    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) {
        /*...*/
    }

    class ButtonState : State {}
}
