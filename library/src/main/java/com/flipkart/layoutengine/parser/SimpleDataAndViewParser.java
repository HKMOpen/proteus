package com.flipkart.layoutengine.parser;

import android.view.View;

import org.json.JSONObject;

import java.util.Map;
import java.util.Objects;

/**
 * A {@link com.flipkart.layoutengine.parser.DataAndViewParser} implementation to update the data
 * associated with a {@link android.view.View} built using a {@link com.flipkart.layoutengine.builder.LayoutBuilder}.
 *
 * @author Aditya Sharat {@literal <aditya.sharat@flipkart.com>}
 */
public class SimpleDataAndViewParser implements DataAndViewParser {

    private Map<String, Object> dataModelToViewModelTree;
    private View view;

    public SimpleDataAndViewParser (View view, Map<String, Object> dataModelToViewModelTree) {
        this.view = view;
        this.dataModelToViewModelTree = dataModelToViewModelTree;
    }

    @Override
    public View getView() {
        return this.view;
    }

    @Override
    public View updateView(JSONObject data) {
        return this.view;
    }
}
