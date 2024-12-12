
# Benchmark debug builds of the app
gradle-profiler \
  --benchmark \
  --project-dir ../../ \
  --measure-config-time \
  assembleDebug

# Benchmark test builds
#gradle-profiler \
#  --benchmark \
#  --project-dir ../../ \
#  test