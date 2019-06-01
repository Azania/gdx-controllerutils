package com.badlogic.gdx.controllers;

/**
 * Advanced controller interface giving access to methods that are not supported by the
 * {@link Controller} interface.
 */
public interface AdvancedController extends Controller {
    public static final int PLAYER_IDX_UNSET = -1;

    /**
     * @return whether the connected controller (or the current controller implementation) can rumble
     */
    boolean canVibrate();

    /**
     * @return if the controller is currently rumbling
     */
    boolean isVibrating();

    /**
     * starts rumbling
     *
     * @param strength value between 0f and 1f
     */
    void startVibration(float strength);

    /**
     * stops rumbling
     */
    void stopVibration();

    /**
     * @return unique ID to recognize this controller if more than one of the same controller models are connected.
     * Use this to map a controller to a player, but do not use it to save a button mapping.
     */
    String getUniqueId();

    /**
     * @return whether the connected controller (or the implementation) can show the current player index
     */
    boolean supportsPlayerIndex();

    /**
     * @return player index of this controller, or PLAYER_IDX_UNSET if none is set
     */
    int getPlayerIndex();

    /**
     * sets the player index of this controller
     *
     * @param index 0 typically 0 to 3 for player indices, and PLAYER_IDX_UNSET for unset
     */
    void setPlayerIndex(int index);

    /**
     * @return the minimum button index code that can be queried
     */
    int getMinButtonIndex();

    /**
     * @return the maximum button index code that can be queried
     */
    int getMaxButtonIndex();

    /**
     * @return number of axis of this controller
     */
    int getAxisCount();

    /**
     * @return number of dpads of this controller
     */
    int getPovCount();
}