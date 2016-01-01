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
import jsettlers.common.landscape.EResourceType;
import jsettlers.common.position.ShortPoint2D;
import jsettlers.graphics.localization.Labels;
import jsettlers.mapcreator.localization.EditorLabels;

/**
 * This error descibes a resource that was placed on the wrong landscape type.
 * 
 * @author michael
 *
 */
public class ResourceError extends LocalizedError {
	private final EResourceType resource;
	private final ELandscapeType landscape;

	/**
	 * Create a new {@link ResourceError}
	 * 
	 * @param position
	 *            The position
	 * @param resource
	 *            The resource that was wrong.
	 * @param landscape
	 *            The landscape type the resource was placed on.
	 */
	public ResourceError(ShortPoint2D position, EResourceType resource, ELandscapeType landscape) {
		super(position, "error.resourceonlandscape");
		this.resource = resource;
		this.landscape = landscape;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ResourceError [resource=");
		builder.append(resource);
		builder.append(", landscape=");
		builder.append(landscape);
		builder.append("]");
		return builder.toString();
	}

	@Override
	protected List<Object> getFormatArgs() {
		return Arrays.asList(
				Labels.getName(resource),
				EditorLabels.getName(landscape)
				);
	};
}
