# Benchmarking Now in Android

This directory will contain benchmarking results for builds of Now in Android. The intention of this is to demonstrate the impact of Gradle changes upon a well known project.

The primary project will be a rigorous application of the `:api`/`:impl` module structure upon a well known application. I want to demonstrate the following: 

- The negative impact of more modules on configuration time
- The positive impact of a configuration cache
- The positive impact on incremental build times
- The negative impact of a partially modularised project on build times

