package codetail.graphics.drawables;

import static android.os.Build.VERSION_CODES.KITKAT;
import static android.os.Build.VERSION_CODES.LOLLIPOP;

import android.os.Build;

/**
 * Helper class to avoid boilerplate Build version checks
 *
 * @hide
 */
class Android {

    private static int VERSION = Build.VERSION.SDK_INT;

    /**
     * Return whether current {@link #VERSION} is equals Lollipop(21)
     * sdk version
     *
     * @return whether current version is equals Lollipop(21)
     * sdk version
     */
    static boolean isLollipop() {
        return VERSION >= LOLLIPOP;
    }

    /**
     * Return whether current {@link #VERSION} is equals Kitkat(19)
     * sdk version
     *
     * @return whether current version is equals Kitkat(19)
     * sdk version
     */
    static boolean isKitkat() {
        return VERSION >= KITKAT;
    }

}
