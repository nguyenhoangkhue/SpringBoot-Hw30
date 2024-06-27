package com.example.springboothw30.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class WebController {
    @GetMapping("/")
    public String getHome(){
        return "Home page";
    }
    @GetMapping("/dashboard")
    public String getDashboard(){
        return "Dashboard Page";
    }
    @GetMapping("/api/users")
    public String getUser() {
        return "User page";
    }

    @PostMapping("/api/users")
    public String createUser() {
        return "Create user";
    }

    @PutMapping("/api/users/{id}")
    public String updateUser(@PathVariable("id") String id) {
        return "Update user " + id;
    }
    @GetMapping("/api/categories")
    public String getCategory() {
        return "Category Page";
    }

    @PostMapping("/api/categories")
    public String createCategory() {
        return "Create category";
    }

    @PutMapping("/api/categories/{id}")
    public String updateCategory(@PathVariable("id") String id) {
        return "Update category " + id;
    }

    @DeleteMapping("/api/categories/{id}")
    public String deleteCategory(@PathVariable("id") String id) {
        return "Delete category " + id;
    }
    @GetMapping("/api/products")
    public String getProduct() {
        return "Product Page";
    }

    @PostMapping("/api/products")
    public String createProduct() {
        return "Create product";
    }

    @PutMapping("/api/products/{id}")
    public String updateProduct(@PathVariable("id") String id) {
        return "Update product " + id;
    }

    @DeleteMapping("/api/products/{id}")
    public String deleteProduct(@PathVariable("id") String id) {
        return "Delete product " + id;
    }
    @GetMapping("/api/brands")
    public String getBrand() {
        return "Brand Page";
    }

    @PostMapping("/api/brands")
    public String createBrand() {
        return "Create brand";
    }

    @PutMapping("/api/brands/{id}")
    public String updateBrand(@PathVariable("id") String id) {
        return "Update brand " + id;
    }

    @DeleteMapping("/api/brands/{id}")
    public String deleteBrand(@PathVariable("id") String id) {
        return "Delete brand " + id;
    }
    @GetMapping("/api/orders")
    public String getOrder() {
        return "Order Page";
    }

    @PostMapping("/api/orders")
    public String createOrder() {
        return "Create order";
    }

    @PutMapping("/api/orders/{id}")
    public String updateOrder(@PathVariable("id") String id) {
        return "Update order " + id;
    }
    @GetMapping("/api/posts")
    public String getPost() {
        return "Post Page";
    }

    @PostMapping("/api/posts")
    public String createPost() {
        return "Create post";
    }

    @PutMapping("/api/posts/{id}")
    public String updatePost(@PathVariable("id") String id) {
        return "Update post " + id;
    }

    @DeleteMapping("/api/posts/{id}")
    public String deletePost(@PathVariable("id") String id) {
        return "Delete post " + id;
    }

    @GetMapping("/api/profile")
    public String viewProfile() {
        return "View profile";
    }

    @PutMapping("/api/profile")
    public String updateProfile() {
        return "Update profile";
    }
}
