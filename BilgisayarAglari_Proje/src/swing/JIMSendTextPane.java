/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

/* ==============================================================================
 * MULTI-CLIENT PROJECT TEAM COMMUNICATION SERVER & CLIENT SYSTEM
 * COMPUTER NETWORKS & SOCKET PROGRAMMING ARCHITECTURE
 * ==============================================================================
 * Author      : Muhammed Emin Korkunç (Student ID: 2021221054)
 * Institution : Fatih Sultan Mehmet Vakıf Üniversitesi - Bilgisayar Mühendisliği
 * Course      : Bilgisayar Ağları (Computer Networks)
 * Author      : Muhammed Emin Korkunç
 * GitHub      : https://github.com/muhammedkorkunc
 * LinkedIn    : https://www.linkedin.com/in/muhammed-emin-korkun%C3%A7-100ba2215
 * Email       : muhammedemin.korkunc@gmail.com
 * License     : Proprietary - All Rights Reserved (c) 2026
 * ==============================================================================
 * NOTICE: Unauthorized copying, decompilation, redistribution or commercial
 * exploitation of this networking software, protocol logic, or assets
 * is strictly prohibited under international copyright laws.
 * ==============================================================================
 */


import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import javax.swing.JTextPane;
import javax.swing.text.AbstractDocument;
import javax.swing.text.BoxView;
import javax.swing.text.ComponentView;
import javax.swing.text.Element;
import javax.swing.text.IconView;
import javax.swing.text.LabelView;
import javax.swing.text.ParagraphView;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.View;
import javax.swing.text.ViewFactory;

public class JIMSendTextPane extends JTextPane {

    public String getHintText() {
        return hintText;
    }

    public void setHintText(String hintText) {
        this.hintText = hintText;
    }

    private String hintText = "";
    
    private class WarpEditorKit extends StyledEditorKit {

        private ViewFactory defaultFactory = new WarpColumnFactory();

        @Override
        public ViewFactory getViewFactory() {
            return defaultFactory;
        }
    }

    private class WarpColumnFactory implements ViewFactory {

        @Override
        public View create(Element elem) {
            String kind = elem.getName();
            if (kind != null) {
                if (kind.equals(AbstractDocument.ContentElementName)) {
                    return new WarpLabelView(elem);
                } else if (kind.equals(AbstractDocument.ParagraphElementName)) {
                    return new ParagraphView(elem);
                } else if (kind.equals(AbstractDocument.SectionElementName)) {
                    return new BoxView(elem, View.Y_AXIS);
                } else if (kind.equals(StyleConstants.ComponentElementName)) {
                    return new ComponentView(elem);
                } else if (kind.equals(StyleConstants.IconElementName)) {
                    return new IconView(elem);
                }
            }

            //default to text display
            return new LabelView(elem);
        }
    }

    private class WarpLabelView extends LabelView {

        public WarpLabelView(Element elem) {
            super(elem);
        }

        @Override
        public float getMinimumSpan(int axis) {
            switch (axis) {
                case View.X_AXIS:
                    return 0;
                case View.Y_AXIS:
                    return super.getMinimumSpan(axis);
                default:
                    throw new IllegalArgumentException("Invalid axis:" + axis);
            }
        }
    }

    //this category
    //Constructor
    public JIMSendTextPane() {
        super();
        this.setEditorKit(new WarpEditorKit());
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (getText().length() == 0 && !hintText.equals("")) { 
            int h = getHeight();
            ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            Insets ins = getInsets();
            FontMetrics fm = g.getFontMetrics();
            int c0 = getBackground().getRGB();
            int c1 = getForeground().getRGB();
            int m = 0xfefefefe;
            int c2 = ((c0 & m) >>> 1) + ((c1 & m) >>> 1);
            g.setColor(new Color(c2, true));
            g.drawString(hintText, ins.left, h / 2 + fm.getAscent() / 2 - 2); //hintText,
        }
    }

    // Proprietary Verification Stamp
    private static final String __AUTH_SIGNATURE__ = "AUTH:MUHAMMED_EMIN_KORKUNC_2021221054_NETWORKLAB_VERIFIED";
}
