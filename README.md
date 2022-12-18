# Configuration Cache `processResources` reproducer

## Steps to reproduce

1. Start with a clean GitHub actions cache
![img.png](assets/img.png)

2. Run the `Build` workflow
![img_1.png](assets/img_1.png)

3. First build completes successfully and stores configuration cache entry [[link](https://github.com/erichaagdev/configuration-cache-process-resources-reproducer/actions/runs/3725754214/jobs/6318760166#step:4:24)]
![img_2.png](assets/img_2.png)

4. Run the `Build` workflow again
![img_3.png](assets/img_3.png)

5. Second build completes but configuration cache was not used because [[link](https://github.com/erichaagdev/configuration-cache-process-resources-reproducer/actions/runs/3725761500/jobs/6318772513#step:4:11)]
```
Calculating task graph as configuration cache cannot be reused because an input to task ':build-logic:reproducer-plugin:processResources' has changed.
```
![img_4.png](assets/img_4.png)
