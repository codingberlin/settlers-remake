/*******************************************************************************
 * Copyright (c) 2015
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *******************************************************************************/
package jsettlers.mapcreator.main.error;

import jsettlers.common.position.ILocatable;
import jsettlers.common.position.ShortPoint2D;

/**
 * This is an error that occured during the map editor validation.
 * 
 * @author michael
 *
 */
public abstract class MapCreatorError implements ILocatable {
	private final ShortPoint2D position;

	public MapCreatorError(ShortPoint2D position) {
		this.position = position;
	}

	@Override
	public ShortPoint2D getPos() {
		return position;
	}

	/**
	 * Gets a description describing this error. This message should be localized.
	 * 
	 * @return The localized description of this error.
	 */
	public abstract String getShortDescription();

	/**
	 * Returns the long description of this error. The description may use HTML.
	 * 
	 * @return The long, localized explanation about this error.
	 */
	public String getDescription() {
		return getShortDescription();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MapCreatorError [position=");
		builder.append(position);
		builder.append(", ");
		builder.append(getShortDescription());
		builder.append("]");
		return builder.toString();
	}
}
