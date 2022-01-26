/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * ArrayOfNumberOnly
 */
@JsonPropertyOrder({
  ArrayOfNumberOnly.JSON_PROPERTY_ARRAY_NUMBER
})
@JsonTypeName("ArrayOfNumberOnly")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen")
@Introspected
public class ArrayOfNumberOnly {
    public static final String JSON_PROPERTY_ARRAY_NUMBER = "ArrayNumber";
    private List<BigDecimal> arrayNumber = null;

    public ArrayOfNumberOnly() {
    }
    public ArrayOfNumberOnly arrayNumber(List<BigDecimal> arrayNumber) {
        this.arrayNumber = arrayNumber;
        return this;
    }

    public ArrayOfNumberOnly addArrayNumberItem(BigDecimal arrayNumberItem) {
        if (this.arrayNumber == null) {
            this.arrayNumber = new ArrayList<BigDecimal>();
        }
        this.arrayNumber.add(arrayNumberItem);
        return this;
    }

    /**
     * Get arrayNumber
     * @return arrayNumber
     **/
    @Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ARRAY_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public List<BigDecimal> getArrayNumber() {
        return arrayNumber;
    }

    @JsonProperty(JSON_PROPERTY_ARRAY_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
       public void setArrayNumber(List<BigDecimal> arrayNumber) {
        this.arrayNumber = arrayNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ArrayOfNumberOnly arrayOfNumberOnly = (ArrayOfNumberOnly) o;
        return Objects.equals(this.arrayNumber, arrayOfNumberOnly.arrayNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrayNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArrayOfNumberOnly {\n");
        sb.append("    arrayNumber: ").append(toIndentedString(arrayNumber)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
