follow https://github.com/marketplace/actions/deploy-publish-javadoc
1. create repo
2. add workflow  at main branch .github/workflows/publish-javadoc.yml
contents of publish-javadoc.yml
name: Deploy Javadoc

on:
  push:
    branches:
      - master
      - main

jobs:
  publish:
    runs-on: ubuntu-latest
    steps:
      - name: Deploy JavaDoc
        uses: MathieuSoysal/Javadoc-publisher.yml@v2.4.0
        with:
          GITHUB_TOKEN: ${{ secrets.MY_PAT_GITHUB_TOKEN }}
          javadoc-branch: javadoc
          java-version: 17
          target-folder: javadoc 
          project: maven 

note : secret should be created from settings/secrets/actions path (Actions secrets and variables)

commit the code with a maven based project . once the workflow "Deploy Javadoc" is successfully run at path actions/workflows/publish-javadoc.yml , perform step 3 onwards . after the workflow is finished successfully a new branch javadoc is created with all javadoc code in it. you can see the code in github by switching the branch to javadoc from main.

3. enable gh pages at path settings/pages (GitHub Pages) . enable "deploy from a branch" . select javadoc branch and path be /root . save the configuraiton. a new workflow will trigger automatically after saving it . after successful workflow run page https://jitendrakumar2006.github.io/publish-javadoc/javadoc will show javadocs.

4. now every time a commit on main branch will trigger the Deploy Javadoc, which will push the code javadoc branch . as there is a change in javadoc branch hence the pages will be rebuilt .

Issues :
1. how the javadoc will maintain the versioning .
current its overwriting earlier javadoc and always publishing to https://jitendrakumar2006.github.io/publish-javadoc/javadoc/io/github/jitendrakumar2006/TestMathFunctions.html

2. need to check how can we publish https://jitendrakumar2006.github.io/publish-javadoc/javadoc/{v1}/io/github/jitendrakumar2006/TestMathFunctions.html
https://jitendrakumar2006.github.io/publish-javadoc/javadoc/{v2}/io/github/jitendrakumar2006/TestMathFunctions.html

or 
https://jitendrakumar2006.github.io/publish-javadoc/{v1}/javadoc/io/github/jitendrakumar2006/TestMathFunctions.html
https://jitendrakumar2006.github.io/publish-javadoc/{v2}/javadoc/io/github/jitendrakumar2006/TestMathFunctions.html



Look at 
https://oracle.github.io/opengrok/javadoc/ (there is no versioning of javadocs . its always seems latest).

https://oracle.github.io/opengrok
https://github.com/oracle/opengrok
https://github.com/oracle/opengrok/tree/master/.github/workflows
https://github.com/oracle/opengrok/tree/gh-pages

https://docs.oracle.com/en-us/iaas/tools/java/3.18.0/ based on https://github.com/oracle/oci-java-sdk/releases/tag/v3.18.0
https://docs.oracle.com/en-us/iaas/tools/python/2.105.0/ based https://github.com/oracle/oci-python-sdk/releases/tag/v2.105.0
so oci java and python sdk also seems to be making the latest sdk javadoc available and not all the versions .

