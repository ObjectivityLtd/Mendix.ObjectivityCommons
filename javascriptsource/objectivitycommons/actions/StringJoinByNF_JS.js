// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
import { Big } from "big.js";

// BEGIN EXTRA CODE
// END EXTRA CODE

/**
 * Same as StringJoin_JS, but getting the string value to join from each entity is different: calls the given NANOFLOW instead of an ATTRIBUTE.
 * The nanoflow should accept the entity as param, and return string as result.
 * @param {MxObject[]} list - Input list of objects to join
 * @param {string} separator
 * @param {Nanoflow} nanoflow - Nanoflow to get value to join for each List item.
The nanoflow should accept the entity as param (named as below) and return string as result.
 * @param {string} nanoflowParamName - Name of nanoflow param for each item.
Leave empty to use entity name (short = without module name prefix).
 * @returns {Promise.<string>}
 */
export async function StringJoinByNF_JS(list, separator, nanoflow, nanoflowParamName) {
	// BEGIN USER CODE
	if (!nanoflow)	throw new TypeError("Input parameter 'Nanoflow' is required.");

	let sep = separator || '';
	let parts = await Promise.all(list.map(obj => nanoflow({
			[nanoflowParamName || obj.getEntity().split('.').pop()]: obj
	})));
	let ret = parts.join(sep);
	return Promise.resolve(ret);
	// END USER CODE
}
