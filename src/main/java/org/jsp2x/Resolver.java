/*
 * Copyright (c) 2008, Hannes Schmidt. All rights reserved.
 * 
 * This file is part of Jsp2X.
 * 
 * Jsp2X is free software: you can redistribute it and/or modify it under the terms of the GNU
 * Lesser Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * Jsp2X is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser
 * Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser Public License along with Jsp2X. If not, see
 * <http://www.gnu.org/licenses/>.
 * 
 * $Author$ 
 * $Date$ 
 * $Rev$
 */
/**
 *
 */
package org.jsp2x;

import java.io.IOException;


public interface Resolver {

    String rewriteLogicalPath( String logicalPath );

    String physicalPathFor( String logicalPath );

    void createUtilityTagFiles( String namespace ) throws IOException;
}
