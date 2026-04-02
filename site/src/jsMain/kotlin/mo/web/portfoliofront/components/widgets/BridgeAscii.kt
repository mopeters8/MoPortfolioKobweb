package mo.web.portfoliofront.components.widgets

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Pre
import org.jetbrains.compose.web.dom.Text

@Composable
fun BridgeAscii() {
    Pre(attrs = { classes("bridge-ascii-art") }) {
        Text(
            """
                         @\_______/@
                        @|XXXXXXXX |
                       @ |X||    X |
                      @  |X||    X |
                     @   |XXXXXXXX |
                    @    |X||    X |             V
                   @     |X||   .X |
                  @      |X||.  .X |                      V
                 @      |%XXXXXXXX%||
                @       |X||  . . X||
                        |X||   .. X||                               @     @
                        |X||  .   X||.                              ||====%
                        |X|| .    X|| .                             ||    %
                        |X||.     X||   .                           ||====%
                       |XXXXXXXXXXXX||     .                        ||    %
                       |XXXXXXXXXXXX||         .                 .  ||====% .
                       |XX|        X||                .        .    ||    %  .
                       |XX|        X||                   .          ||====%   .
                       |XX|        X||              .          .    ||    %     .
                       |XX|======= X||============================+ || .. %  ..............
                ===== /            X||                              ||    %
                                   X||           /)                 ||    %
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
            """.trimIndent()
        )
    }
}