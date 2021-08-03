#!/bin/bash

repl(){
  clj \
    -X:repl deps-repl.core/process \
    :main-ns deps-install.main \
    :port 7788 \
    :host '"0.0.0.0"' \
    :repl? true \
    :nrepl? false
}

main(){
  clojure \
    -J-Dclojure.core.async.pool-size=1 \
    -J-Dclojure.compiler.direct-linking=false \
    -M -m deps-install.main
}

uberjar(){
  clj \
    -X:uberjar genie.core/process \
    :uberjar-name out/deps-install.standalone.jar \
    :main-ns deps-install.main
  mkdir -p out/jpackage-input
  mv out/deps-install.standalone.jar out/jpackage-input/
}

"$@"