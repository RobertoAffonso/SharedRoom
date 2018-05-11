/**
 * @author Roberto Affonso Araújo
 *
 */
package com.sharedroom.model.ValueObject;

import javax.xml.bind.ValidationException;

public interface PersistanceValueObject {
	public boolean validate() throws ValidationException;
}

