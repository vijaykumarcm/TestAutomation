package models.controls;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;

public enum KSKeys {
    NULL(Keys.NULL),
    CANCEL(Keys.CANCEL),
    HELP(Keys.HELP),
    BACK_SPACE(Keys.BACK_SPACE),
    TAB(Keys.TAB),
    CLEAR(Keys.CLEAR),
    RETURN(Keys.RETURN),
    ENTER(Keys.ENTER),
    SHIFT(Keys.SHIFT),
    CONTROL(Keys.CONTROL),
    ALT(Keys.ALT),
    PAUSE(Keys.PAUSE),
    ESCAPE(Keys.ESCAPE),
    SPACE(Keys.SPACE),
    PAGE_UP(Keys.PAGE_UP),
    PAGE_DOWN(Keys.PAGE_DOWN),
    END(Keys.END),
    HOME(Keys.HOME),
    LEFT(Keys.LEFT),
    UP(Keys.UP),
    RIGHT(Keys.RIGHT),
    DOWN(Keys.DOWN),
    INSERT(Keys.INSERT),
    DELETE(Keys.DELETE),
    SEMICOLON(Keys.SEMICOLON),
    EQUALS(Keys.EQUALS),
    NUMPAD0(Keys.NUMPAD0),
    NUMPAD1(Keys.NUMPAD1),
    NUMPAD2(Keys.NUMPAD2),
    NUMPAD3(Keys.NUMPAD3),
    NUMPAD4(Keys.NUMPAD4),
    NUMPAD5(Keys.NUMPAD5),
    NUMPAD6(Keys.NUMPAD6),
    NUMPAD7(Keys.NUMPAD7),
    NUMPAD8(Keys.NUMPAD8),
    NUMPAD9(Keys.NUMPAD9),
    MULTIPLY(Keys.MULTIPLY),
    ADD(Keys.ADD),
    SEPARATOR(Keys.SEPARATOR),
    SUBTRACT(Keys.SUBTRACT),
    DECIMAL(Keys.DECIMAL),
    DIVIDE(Keys.DIVIDE),
    F1(Keys.F1),
    F2(Keys.F2),
    F3(Keys.F3),
    F4(Keys.F4),
    F5(Keys.F5),
    F6(Keys.F6),
    F7(Keys.F7),
    F8(Keys.F8),
    F9(Keys.F9),
    F10(Keys.F10),
    F11(Keys.F11),
    F12(Keys.F12),
    META(Keys.META),
    COMMAND(Keys.COMMAND),
    TEXT();

    public final Keys key;
    public String text;

    private KSKeys(Keys key) {
        this.key = key;
        this.text = "";
    }

    private KSKeys() {
        this.key = null;
        this.text = "";
    }

    void setText(String text) {
        this.text = text;
    }

    /**
     * Gets a KSKey from a string.
     *
     * @param key The key string
     * @return The KSKey
     */
    public static KSKeys getKey(String key) {
        switch (key) {
            case "NULL":
                return NULL;
            case "CANCEL":
                return CANCEL;
            case "HELP":
                return HELP;
            case "BACK_SPACE":
                return BACK_SPACE;
            case "TAB":
                return TAB;
            case "CLEAR":
                return CLEAR;
            case "RETURN":
                return RETURN;
            case "ENTER":
                return ENTER;
            case "SHIFT":
                return SHIFT;
            case "CONTROL":
                return CONTROL;
            case "ALT":
                return ALT;
            case "PAUSE":
                return PAUSE;
            case "ESCAPE":
                return ESCAPE;
            case "SPACE":
                return SPACE;
            case "PAGE_UP":
                return PAGE_UP;
            case "PAGE_DOWN":
                return PAGE_DOWN;
            case "END":
                return END;
            case "HOME":
                return HOME;
            case "LEFT":
                return LEFT;
            case "UP":
                return UP;
            case "RIGHT":
                return RIGHT;
            case "DOWN":
                return DOWN;
            case "INSERT":
                return INSERT;
            case "DELETE":
                return DELETE;
            case "SEMICOLON":
                return SEMICOLON;
            case "EQUALS":
                return EQUALS;
            case "NUMPAD0":
                return NUMPAD0;
            case "NUMPAD1":
                return NUMPAD1;
            case "NUMPAD2":
                return NUMPAD2;
            case "NUMPAD3":
                return NUMPAD3;
            case "NUMPAD4":
                return NUMPAD4;
            case "NUMPAD5":
                return NUMPAD5;
            case "NUMPAD6":
                return NUMPAD6;
            case "NUMPAD7":
                return NUMPAD7;
            case "NUMPAD8":
                return NUMPAD8;
            case "NUMPAD9":
                return NUMPAD9;
            case "MULTIPLY":
                return MULTIPLY;
            case "ADD":
                return ADD;
            case "SEPARATOR":
                return SEPARATOR;
            case "SUBTRACT":
                return SUBTRACT;
            case "DECIMAL":
                return DECIMAL;
            case "DIVIDE":
                return DIVIDE;
            case "F1":
                return F1;
            case "F2":
                return F2;
            case "F3":
                return F3;
            case "F4":
                return F4;
            case "F5":
                return F5;
            case "F6":
                return F6;
            case "F7":
                return F7;
            case "F8":
                return F8;
            case "F9":
                return F9;
            case "F10":
                return F10;
            case "F11":
                return F11;
            case "F12":
                return F12;
            case "META":
                return META;
            case "COMMAND":
                return COMMAND;
            default:
                return TEXT;
        }
    }

    /**
     * Gets a list of keys from a text string.
     *
     * @param text The text
     * @return The list of KSKeys
     */
    public static List<KSKeys> getKeysFrom(String text) {

        if (text.contains("<") && text.contains(">")) {
            List<KSKeys> keys = new ArrayList<>();

            String[] ksplit1 = text.split("<");

            for (String split : ksplit1) {
                if (!split.equals("")) {
                    String[] ksplit2 = split.split(">");

                    for (String value : ksplit2) {
                        KSKeys key = KSKeys.getKey(value);
                        key.setText(value);
                        keys.add(key);
                    }
                }
            }

            return keys;
        }
        else {
            return new ArrayList<>();
        }
    }
}
