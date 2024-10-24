package com.personal.app.product.entity;

import com.personal.app.product.interfaces.Product;
import com.personal.app.shared.Helper;
import com.personal.app.shared.responses.BadRequest;
import com.personal.app.shared.responses.Created;
import com.personal.app.shared.responses.Ok;
import com.personal.app.shared.responses.Response;

public class ProductEntity {

    public Product props;

    private ProductEntity(Product props) {
        this.props = props;
    }

    public static Response<ProductEntity> create(String id, String name, Float price, Byte quantity) {
        Response valid = ProductEntity.validate(id, name, price, quantity);
        if (!valid.isOk()) {
            return valid;
        }
        return new Created(new ProductEntity(new Product(id, name, price, quantity)));
    }

    private static Response validate(String id, String name, Float price, Byte quantity) {
        if (!Helper.isStringOk(id)) {
            return new BadRequest("Invalid Id");
        }
        if (!Helper.isStringOk(name)) {
            return new BadRequest("Invalid Name");
        }
        if (!Helper.isFloatOk(price)) {
            return new BadRequest("Invalid Price");
        }
        if (!Helper.isByteOk(quantity)) {
            return new BadRequest("Invalid Quantity");
        }
        return new Ok(null);
    }
}
