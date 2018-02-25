# boilerplate
A boilerplate for android apps using clean architecture and mvp

This project was started to help get android app projects faster off the ground, aiming to be a great general purpose
boilerplate with a lot of built in common functionality

# Usage
The basic idea is clean architecture, with mvp for views.
If you don't know what clean architecture is recommend this great talk by bob martin -
https://www.youtube.com/watch?v=o_TH-Y78tt4

What you need to know about using this boilerplate -
Interactor = UseCase, write one for every "feature" your app need to implement and run it using an executor.
Every view, be it an activity fragment or custom view, implements an IMvpView, and declares it's presenter interface to work with

# Contributing
Any contribution, be it documentation, issue suggestion, or PR is **HIGHLY** appreciated, the more people add functionality/feedback the better this boilerplate becomes :)
