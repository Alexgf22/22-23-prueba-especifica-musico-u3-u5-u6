import java.util.logging.Level
import java.util.logging.LogManager
// Se deja OFF para no mostrarlo al usuario y que únicamente vea los println por pantalla.
internal val l = LogManager.getLogManager().getLogger("").apply { level = Level.OFF }
internal fun i(tag: String, msg: String) {
    l.info("[$tag] - $msg")
}