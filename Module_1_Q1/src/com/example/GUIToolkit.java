package com.example;

public class GUIToolkit {
    private GUIFactory factory;

    public GUIToolkit(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        Button button = factory.createButton();
        button.render();

        Checkbox checkbox = factory.createCheckbox();
        checkbox.render();
    }

    public static void main(String[] args) {
        // Create a Windows GUI toolkit
        GUIFactory windowsFactory = new WindowsFactory();
        GUIToolkit windowsToolkit = new GUIToolkit(windowsFactory);
        windowsToolkit.createUI();

        // Create a MacOS GUI toolkit
        GUIFactory macosFactory = new MacOSFactory();
        GUIToolkit macosToolkit = new GUIToolkit(macosFactory);
        macosToolkit.createUI();
    }
}