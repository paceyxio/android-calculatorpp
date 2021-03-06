/*
 * Copyright 2013 serso aka se.solovyev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Contact details
 *
 * Email: se.solovyev@gmail.com
 * Site:  http://se.solovyev.org
 */

package org.solovyev.android.prefs;

import android.content.SharedPreferences;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class IntegerPreference extends AbstractPreference<Integer> {

    public static final int DEF_VALUE = -1;

    private IntegerPreference(@Nonnull String key, @Nullable Integer defaultValue) {
        super(key, defaultValue);
    }

    @Nonnull
    public static IntegerPreference of(@Nonnull String key, @Nullable Integer defaultValue) {
        return new IntegerPreference(key, defaultValue);
    }

    @Override
    protected Integer getPersistedValue(@Nonnull SharedPreferences preferences) {
        return preferences.getInt(getKey(), DEF_VALUE);
    }

    @Override
    protected void putPersistedValue(@Nonnull SharedPreferences.Editor editor, @Nonnull Integer value) {
        editor.putInt(getKey(), value);
    }

}
