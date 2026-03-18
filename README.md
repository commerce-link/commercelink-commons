# CommerceLink Commons

Shared domain types used across CommerceLink libraries and the main application.

This module has **zero external dependencies** (pure Java 21) and provides:

- **`pl.commercelink.taxonomy.ProductCategory`** — product category enum (CPU, GPU, Laptops, Displays, etc.) organized by `ProductGroup`.
- **`pl.commercelink.taxonomy.ProductGroup`** — top-level product grouping (Computers, PcComponents, Peripherals, etc.).

It's quite likely this library will get deprecated in near future as we migrate towards a more flexible taxonomy system, but for now it serves as a simple shared domain model for product categorization.

## Usage

Add as a Maven dependency:

```xml
<dependency>
    <groupId>pl.commercelink</groupId>
    <artifactId>commercelink-commons</artifactId>
    <version>0.1.0</version>
</dependency>
```

Localization (i18n) is intentionally **not** included in this module. The main application provides `ProductCategoryLocalization` and `ProductGroupLocalization` utilities for resolving localized names.
