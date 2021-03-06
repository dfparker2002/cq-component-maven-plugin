package com.citytechinc.cq.component.touchuidialog.widget.richtexteditor;

import com.citytechinc.cq.component.touchuidialog.widget.DefaultTouchUIWidgetParameters;

public class RichTextEditorWidgetParameters extends DefaultTouchUIWidgetParameters {

    private boolean useFixedInlineToolbar;

    public boolean isUseFixedInlineToolbar() {
        return useFixedInlineToolbar;
    }

    public void setUseFixedInlineToolbar(boolean useFixedInlineToolbar) {
        this.useFixedInlineToolbar = useFixedInlineToolbar;
    }

    @Override
    public String getResourceType() {
        return RichTextEditorWidget.RESOURCE_TYPE;
    }

    @Override
    public void setResourceType(String resourceType) {
        throw new UnsupportedOperationException("resourceType is Static for RichTextEditor");
    }

}
