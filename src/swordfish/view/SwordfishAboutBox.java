/*
 * SwordfishAboutBox.java
 */
package swordfish.view;

import java.awt.Cursor;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import javax.swing.JOptionPane;
import javax.swing.event.HyperlinkEvent;
import org.jdesktop.application.Action;
import swordfish.tools.URLTools;

public class SwordfishAboutBox extends javax.swing.JDialog {

    /**
     * Display the help.html for the application.
     * @param parent
     */
    public SwordfishAboutBox(java.awt.Frame parent) {
        super(parent);
        initComponents();
        getRootPane().setDefaultButton(closeButton);
        try {
            URL helpURL = this.getClass().getResource("resources/help.html");
            helpEditorPane.setPage(helpURL);
            helpEditorPane.setEditable(false);
        } catch (IOException ex) {
            System.err.println(ex.toString());
        }
    }

    /**
     * Hide the about box
     */
    @Action
    public void closeAboutBox() {
        setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeButton = new javax.swing.JButton();
        javax.swing.JLabel appTitleLabel = new javax.swing.JLabel();
        javax.swing.JLabel versionLabel = new javax.swing.JLabel();
        javax.swing.JLabel appVersionLabel = new javax.swing.JLabel();
        javax.swing.JLabel vendorLabel = new javax.swing.JLabel();
        javax.swing.JLabel appVendorLabel = new javax.swing.JLabel();
        javax.swing.JLabel homepageLabel = new javax.swing.JLabel();
        javax.swing.JLabel appHomepageLabel = new javax.swing.JLabel();
        javax.swing.JLabel appDescLabel = new javax.swing.JLabel();
        javax.swing.JLabel imageLabel = new javax.swing.JLabel();
        helpScrollPane = new javax.swing.JScrollPane();
        helpEditorPane = new swordfish.view.AntiAliasedEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setName("aboutBox"); // NOI18N
        setResizable(false);

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(swordfish.view.SwordfishApp.class).getContext().getActionMap(SwordfishAboutBox.class, this);
        closeButton.setAction(actionMap.get("closeAboutBox")); // NOI18N
        closeButton.setName("closeButton"); // NOI18N

        appTitleLabel.setFont(appTitleLabel.getFont().deriveFont(appTitleLabel.getFont().getStyle() | java.awt.Font.BOLD, appTitleLabel.getFont().getSize()+4));
        appTitleLabel.setName("appTitleLabel"); // NOI18N

        versionLabel.setFont(versionLabel.getFont().deriveFont(versionLabel.getFont().getStyle() | java.awt.Font.BOLD));
        versionLabel.setName("versionLabel"); // NOI18N

        appVersionLabel.setName("appVersionLabel"); // NOI18N

        vendorLabel.setFont(vendorLabel.getFont().deriveFont(vendorLabel.getFont().getStyle() | java.awt.Font.BOLD));
        vendorLabel.setName("vendorLabel"); // NOI18N

        appVendorLabel.setName("appVendorLabel"); // NOI18N

        homepageLabel.setFont(homepageLabel.getFont().deriveFont(homepageLabel.getFont().getStyle() | java.awt.Font.BOLD));
        homepageLabel.setName("homepageLabel"); // NOI18N

        appHomepageLabel.setName("appHomepageLabel"); // NOI18N

        appDescLabel.setName("appDescLabel"); // NOI18N

        imageLabel.setName("imageLabel"); // NOI18N

        helpScrollPane.setName("helpScrollPane"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(swordfish.view.SwordfishApp.class).getContext().getResourceMap(SwordfishAboutBox.class);
        helpEditorPane.setContentType(resourceMap.getString("helpEditorPane.contentType")); // NOI18N
        helpEditorPane.setName("helpEditorPane"); // NOI18N
        helpEditorPane.addHyperlinkListener(new javax.swing.event.HyperlinkListener() {
            public void hyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {
                helpEditorPaneHyperlinkUpdate(evt);
            }
        });
        helpScrollPane.setViewportView(helpEditorPane);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(imageLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(helpScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(versionLabel)
                            .add(vendorLabel))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, appTitleLabel)
                            .add(layout.createSequentialGroup()
                                .add(homepageLabel)
                                .add(631, 631, 631)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(appVersionLabel)
                                    .add(appVendorLabel)
                                    .add(appHomepageLabel)
                                    .add(appDescLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, closeButton)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(imageLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 537, Short.MAX_VALUE)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(appTitleLabel)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(433, 433, 433)
                        .add(appDescLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(versionLabel)
                            .add(appVersionLabel))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(vendorLabel)
                            .add(appVendorLabel)))
                    .add(helpScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 480, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(homepageLabel)
                    .add(appHomepageLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 14, Short.MAX_VALUE)
                .add(closeButton))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void helpEditorPaneHyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {//GEN-FIRST:event_helpEditorPaneHyperlinkUpdate
    if (evt.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
        try {
            if (!evt.getURL().toString().startsWith("http://")) {
                helpEditorPane.setPage(evt.getURL());
                setCursor(Cursor.getDefaultCursor());
            } else {
                URLTools.openURL(evt.getURL().toString());
            }
        } catch (IOException ex) {
            // Some warning to user
            }
    } else if (evt.getEventType() == HyperlinkEvent.EventType.ENTERED) { 
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    } else if (evt.getEventType() == HyperlinkEvent.EventType.EXITED) { 
        setCursor(Cursor.getDefaultCursor());
    }
}//GEN-LAST:event_helpEditorPaneHyperlinkUpdate
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private swordfish.view.AntiAliasedEditorPane helpEditorPane;
    private javax.swing.JScrollPane helpScrollPane;
    // End of variables declaration//GEN-END:variables
//    private static void openURL(String url) {
//        String osName = System.getProperty("os.name");
//        try {
//            if (osName.startsWith("Mac OS")) {
//                Class fileMgr = Class.forName("com.apple.eio.FileManager");
//                Method openURL = fileMgr.getDeclaredMethod("openURL",
//                        new Class[]{String.class});
//                openURL.invoke(null, new Object[]{url});
//            } else if (osName.startsWith("Windows")) {
//                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
//            } else { //assume Unix or Linux
//                String[] browsers = {
//                    "firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape"
//                };
//                String browser = null;
//                for (int count = 0; count < browsers.length && browser == null; count++) {
//                    if (Runtime.getRuntime().exec(
//                            new String[]{"which", browsers[count]}).waitFor() == 0) {
//                        browser = browsers[count];
//                    }
//                }
//                if (browser == null) {
//                    throw new Exception("Could not find web browser");
//                } else {
//                    Runtime.getRuntime().exec(new String[]{browser, url});
//                }
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Could Not Launch Web Browser" + ":\n" + e.getLocalizedMessage());
//        }
//    }
}
