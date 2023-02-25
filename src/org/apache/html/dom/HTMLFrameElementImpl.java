/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.html.dom;

import org.w3c.dom.Document;
import org.w3c.dom.html.HTMLFrameElement;

/**
 * @xerces.internal
 * @version $Revision: 447255 $ $Date: 2006-09-18 01:36:42 -0400 (Mon, 18 Sep 2006) $
 * @author <a href="mailto:arkin@exoffice.com">Assaf Arkin</a>
 * @see org.w3c.dom.html.HTMLFrameElement
 * @see org.apache.xerces.dom.ElementImpl
 */
public class HTMLFrameElementImpl
    extends HTMLElementImpl
    implements HTMLFrameElement
{

    private static final long serialVersionUID = 635237057173695984L; 

    public String getFrameBorder()
    {
        return getAttribute( "frameborder" );
    }
    
    
    public void setFrameBorder( String frameBorder )
    {
        setAttribute( "frameborder", frameBorder );
    }
  
  
    public String getLongDesc()
    {
        return getAttribute( "longdesc" );
    }
    
    
    public void setLongDesc( String longDesc )
    {
        setAttribute( "longdesc", longDesc );
    }
  
  
    public String getMarginHeight()
    {
        return getAttribute( "marginheight" );
    }
    
    
    public void setMarginHeight( String marginHeight )
    {
        setAttribute( "marginheight", marginHeight );
    }
  
  
    public String getMarginWidth()
    {
        return getAttribute( "marginwidth" );
    }
    
    
    public void setMarginWidth( String marginWidth )
    {
        setAttribute( "marginwidth", marginWidth );
    }
  
  
    public String getName()
    {
        return getAttribute( "name" );
    }
    
    
    public void setName( String name )
    {
        setAttribute( "name", name );
    }

    
    public boolean getNoResize()
    {
        return getBinary( "noresize" );
    }
    
    
    public void setNoResize( boolean noResize )
    {
        setAttribute( "noresize", noResize );
    }

    
    public String getScrolling()
    {
        return capitalize( getAttribute( "scrolling" ) );
    }
    
    
    public void setScrolling( String scrolling )
    {
        setAttribute( "scrolling", scrolling );
    }
  
  
    public String getSrc()
    {
        return getAttribute( "src" );
    }
    
    
    public void setSrc( String src )
    {
        setAttribute( "src", src );
    }

    
    /**
     * Constructor requires owner document.
     * 
     * @param owner The owner HTML document
     */
    public HTMLFrameElementImpl( HTMLDocumentImpl owner, String name )
    {
        super( owner, name );
    }


}

