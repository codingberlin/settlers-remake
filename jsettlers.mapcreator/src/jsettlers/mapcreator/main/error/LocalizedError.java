package jsettlers.mapcreator.main.error;

import jsettlers.common.position.ShortPoint2D;
import jsettlers.mapcreator.localization.EditorLabels;

public class LocalizedError extends MapCreatorError {
	private final String label;

	public LocalizedError(ShortPoint2D position, String label) {
		super(position);
		this.label = label;
	}

	@Override
	public String getDescription() {
		return EditorLabels.getLabel(label + ".description", getFormatArgs());
	}

	private Object[] getFormatArgs() {
		return new Object[0];
	}

	@Override
	public String getShortDescription() {
		return EditorLabels.getLabel(label, getFormatArgs());
	}

}
