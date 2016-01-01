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

import java.util.Arrays;
import java.util.List;

import jsettlers.common.landscape.ELandscapeType;
import jsettlers.common.position.ShortPoint2D;
import jsettlers.mapcreator.localization.EditorLabels;

public class LandscapeTypeError extends LocalizedError {
	private final ELandscapeType landscape1;
	private final ELandscapeType landscape2;

	public LandscapeTypeError(ShortPoint2D position, ELandscapeType landscape1, ELandscapeType landscape2) {
		super(position, "error.landscape");
		this.landscape1 = landscape1;
		this.landscape2 = landscape2;
	}

	@Override
	protected List<Object> getFormatArgs() {
		return Arrays.asList(EditorLabels.getName(landscape1), EditorLabels.getName(landscape2));
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LandscapeTypeError [landscape1=");
		builder.append(landscape1);
		builder.append(", landscape2=");
		builder.append(landscape2);
		builder.append("]");
		return builder.toString();
	}

}
