package com.mualab.org.user.util.transformers;

import android.view.View;

import com.mualab.org.user.R;

public class TextSwitchTransformer extends DefaultTransformer {

	@Override
	public void transformPage(final View page, final int pageIndex, final float position) {
		super.transformPage(page, pageIndex, position);

		final View content = page.findViewWithTag("contentTextView");

		if (inRange(position)) {
			if (position != 0) {

				final float translationX = page.getWidth() * position;
				content.setTranslationX(-translationX);

			} else {

				content.setTranslationX(0);
			}
		} else {
			content.setTranslationX(0);
		}
	}
}
