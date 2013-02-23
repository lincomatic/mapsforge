/*
 * Copyright 2010, 2011, 2012 mapsforge.org
 *
 * This program is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.mapsforge.core.graphics;

public interface Paint {
	int getColor();

	int getTextHeight(String text);

	int getTextWidth(String text);

	void setAlpha(int alpha);

	void setBitmapShader(Bitmap bitmap);

	void setColor(int color);

	void setDashPathEffect(float[] strokeDasharray);

	void setStrokeCap(Cap cap);

	void setStrokeWidth(float width);

	void setStyle(Style style);

	void setTextAlign(Align align);

	void setTextSize(float textSize);

	void setTypeface(FontFamily fontFamily, FontStyle fontStyle);
}