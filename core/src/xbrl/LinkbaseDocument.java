package xbrl;

import ifx.*;

/**
 * Created by apolshchikov on 2016-03-11.
 */
public class LinkbaseDocument {
    private IDocument thisXMLDocument;
    private String thisLinkbasePath;
    private INamespaceManager thisNamespaceManager;
    INode thisLinkbaseNode;

    public XBRLSchema Schema;

    LinkbaseDocument(XBRLSchema ContainingXBRLSchema, String DocumentPath) {
        this.Schema = ContainingXBRLSchema;
        thisLinkbasePath =
    }

    private String GetFullLinkbasePath(String LinkbaseDocFilename) {
        String fullPath;
        int firstPathSeparator = LinkbaseDocFilename.indexOf("/");

    }
}
