package com.company;

/**
 * Basic interface for representing a tic-tac-toe game
 * board. The board could look like the following:
 *
 * x-o
 * --o
 * xox
 *
 * Where 'x' is player 1, 'o' is player 2 and '-' is an
 * empty field.
 *
 * The fields are numbered like this:
 *
 * 123
 * 456
 * 789
 *
 * So valid indices are numbers from 1 to 9, but not 0
 * or 10.
 */
public interface Board {

    /**
     * Clears all values so the board is empty again.
     * So all fields are set to '-'.
     */
    void clear();

    /**
     *
     * @param index The index of the value that should
     *              be returned. Must be a number from
     *              1 to 9. If the index is out of range,
     *              the method returns '-'.
     * @return The value at the specified index.
     */
    char getValueAt(int index);

    /**
     *
     * @param index The index of the value that should
     *              be set. Must be a number from
     *              1 to 9. If the index is out of range,
     *              the method does nothing.
     * @param value The value of the field. Must be
     *              either 'x', 'o' or '-'. If it is none
     *              of those, the method does nothing.
     */
    void setValueAt(int index, char value);
}